package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer room;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer room, Date checkIn, Date checkOut) {
		this.room = room;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		// Pega a diferença entre duas datas e converte para dias
		long dif = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "As datas devem ser futuras à data atual!";
		}
		if(!checkOut.after(checkIn)){
			return "A data de check out é antes da data de check in!";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		// Caso não haja um erro
		return null;
	}
	
	@Override
	public String toString() {
		return "Room: " +room+ ", Check in: " +sdf.format(checkIn)+ ", Check out: " +sdf.format(checkOut)+ ", duração: " +duration()+ " noites";
	}
}
