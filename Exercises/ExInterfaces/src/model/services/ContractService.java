package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		double amount = contract.getTotalValue()/months;
		
		for(int month = 1; month <= months; month++) {
			double interest = onlinePaymentService.interest(amount, month);
			double fee = onlinePaymentService.paymentFee(amount+interest);
			// ^ Também dá pra fazer tudo isso numa linha só, mas fica mt complexo de enteder e mt grande: 
			// double result = amount + onlinePaymentService.interest(amount, month) + onlinePaymentService.paymentFee(amount+onlinePaymentService.interest(amount, month));
			double result = amount + interest + fee;
			
			LocalDate dueDate = contract.getDate().plusMonths(month);
			
			contract.getInstallments().add(new Installment(dueDate, result));
		}
		
	}
}
