package pruebas.p1;

	
public class Pokemon {
		
		int vida;
		String nombre;
		int ataque;
		Pokemon(){
			
		}
		Pokemon(int vida, String nombre){
			this.vida=vida;
			this.nombre=nombre;
		}
		@Override
		public String toString() {
			return nombre +" tiene, "+ vida+ " de vida";
		}
		public int getVida() {
			return vida;
		}
		public void setVida(int vida) {
			this.vida = vida;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("hola jhimmy");
		
			
			Pokemon perro= new Pokemon(5,"Pikachu");
			
			System.out.println(perro.toString());
			

			Pokemon jolteon= new Pokemon(5,"Jolteon");
			
			System.out.println(jolteon.toString());
			

		}

	
}

	

