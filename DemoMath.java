Percobaan 8

public class DemoMath{

     public static void main(string[] args) {
	int a=1, b=2, c=3;
	double x=2.24, y=7.49, z=7.50;

	//max min
	system.out.prinln("Max int : " + Math.max(a,b));
	system.out.prinln("Max double : " + Math.min(y,z));

	//Nilai x
	system.out.prinln("Ceil x : " + Math.ceil(x));
	system.out.prinln("Floor x: " + Math.floor(x));
	system.out.prinln("Round x: " + Math.round(x));

	//Nilai y
	system.out.prinln("Ceil y : " + Math.ceil(y));
	system.out.prinln("Floor y: " + Math.floor(y));
	system.out.prinln("Round y: " + Math.round(y));

	//Nilai z
	system.out.prinln("Ceil z : " + Math.ceil(z));
	system.out.prinln("Floor z: " + Math.floor(z));
	system.out.prinln("Round z: " + Math.round(z));

	//Nilai y
	system.out.prinln("Random-1: " + Math.random());
	system.out.prinln("Random-2: " + Math.random());
	system.out.prinln("Random-3: " + Math.random());
	system.out.prinln("Pangkat b,c : " + Math.pow(b,c));
	}
}