public class PollQuestions {
	   public static void main(String[] args) {
	      Walrus walrus = new Walrus(3500, 10.5);
	      int x = 9;
      
	      doStuff(walrus, x);// return nothing; temporarily change the value of x
	      System.out.println(walrus);
	      System.out.println(x);
	   }	   
	   public static void doStuff(Walrus W, int x) {
	      W.weight = W.weight - 100;// change the value in adress
	      x = x - 5;// change the value of x which store in the doStuff calss
	   }
	   
	   public static class Walrus {
      	public int weight;
	      public double tuskSize;
	      
	      public Walrus(int w, double ts) {
	         weight = w;
	         tuskSize = ts;
	      }
	
	      public String toString() {
	         return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
	      }
	   }
	}
// Question: what is the output?
/* weight: 3400, tusk size: 10.5
 * 9 (the x defined in doStuff is different from the x defind in main function)