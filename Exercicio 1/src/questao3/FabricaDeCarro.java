package questao3;

public class FabricaDeCarro {
	private static FabricaDeCarro uniqueInstance;
	
	private FabricaDeCarro(){}
	
		public static synchronized FabricaDeCarro getInstance(){
			if (uniqueInstance == null)
				uniqueInstance = new FabricaDeCarro();
			return uniqueInstance;
		}
		
		@Override
		public String toString() {
			if(uniqueInstance!=null)
				return "so tem um objeto FabricaDeCarro";
				
			return null;
		}
		
	}

