public class DemoLogika {


pulic static void main(String[] args){
	//beberapa Nilai
	int i = 37;
	int j = 42;
	int k = 42;
	system.out.println("Nilai variabel...");
	system.out.println("i = " + i);
	system.out.println("j = " + j);
	system.out.println("k = " + k);
	//lebih besar dari 
	system.out.println("Lebih besar dari...");
	system.out.println("i > j = " + (i > j)); //false
	system.out.println("j > i = " + (j > i)); //true
	system.out.println("k > j = " + (k > j)); //false
	//lebih besar atau sama dengan
	system.out.println("Lebih besar dari atau sama dengan...");
	system.out.println("i > j = " + (i >= j)); //false
	system.out.println("j > i = " + (j >=i)); //true
	system.out.println("k > j = " + (k >= j)); //true
	//lebih kecil dari
	system.out.println("Lebih besar daari...");
	system.out.println("i < j = " + (i < j)); //true
	system.out.println("j < i = " + (j < i)); //false
	system.out.println("k < j = " + (k < j)); //false
	//lebih kecil atau sama dengan
	system.out.println("Lebih kecil dari atau sama dengan...");
	system.out.println("i < j = " + (i <= j)); //true
	system.out.println("j < i = " + (j <=i)); //false
	system.out.println("k < j = " + (k <= j)); //true
	//sama dengan
	system.out.println("Sama dengan...");
	system.out.println(" i == j = " + (i == j)); //false
	system.out.println(" k == j = " + (k == j)); //true
	//tidak sama dengan
	system.out.println("Tidak sama dengan...");
	system.out.println(" i != j = " + (i != j)); //true
	system.out.println(" k != j = " + (k != j)); //false
	}
}