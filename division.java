package calc;

public class division extends problemas {

		//Propiedades
		private int r;
		private char sign;
		private String oper;
		
		//Constructor
			public division (int numero1, int numero2) {
				super(numero1, numero2);
			}
		
		//Metodos
		public int getRes () {
			r = c / e;
			return r;
		}
		public String getOperation() {
			oper="division";
			return oper;
		}
		public char getSign() {
			sign='/';
			return sign;
		}
}