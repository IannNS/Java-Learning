
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");// Separa strings e assimila-as à um vetor de mesmo tipo
		
		String s01 = original.toLowerCase(); // Para letra minúscula
		String s02 = original.toUpperCase(); // Para letra maiúscula
		String s03 = original.trim(); // Remove espaçamentos
		String s04 = original.substring(2); // Exibe a partir do index x 
		String s05 = original.substring(2, 9); // Exibe a partir do index x até o limite y
		String s06 = original.replace('a', 'x'); // Substitui um char por outro 
		String s07 = original.replace("abc", "xy"); // Substitui uma string por outra
		int i = original.indexOf("bc"); // Primeira ocorrência de "bc"
		int j = original.lastIndexOf("bc"); // Última ocorrência de "bc"
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
		System.out.println("indexOf(\"bc\"): " + i);
		System.out.println("lastIndexOf(\"bc\"): " + j);
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
