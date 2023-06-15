package day1;

public class MyVechile {

	public static void main(String[] args) {
		System.out.println("Specification of BMW");
		System.out.println("*********************");
		Vehicle bmw=new Vehicle();
		String vname=bmw.Vname;
		String VColor=bmw.VColor;
		int VGears=bmw.VGear;
		int VTyres=bmw.VTyres;
		int VAS=bmw.AS;
		System.out.println(" Luxury Car is a: " +vname);
		System.out.println("BMW has a Gears: " +VGears);
		System.out.println("BMW has a Tyres: " +VTyres);
		System.out.println("BMW has a Average Speed: " +VAS);
        System.out.println("BMW has a Colour: " +VColor);
        
        System.out.println("\n");
        
        System.out.println("Information of Human");
        System.out.println("*********************");
        Human naier=new Human();
        String Hname=naier.name;
        int Hage=naier.age;
        String HGender=naier.Gender;
        float Height=naier.Height;
        //long HDOB=naier.DOB;
        System.out.println("This Human name is :"+Hname);
        System.out.println("This Human Age is :"+Hage);
        System.out.println("This Human Gender is :"+HGender);
        System.out.println("This Human Height is :"+Height);
       // System.out.println("This Human Date of Birth is :"+HDOB);
      }
	}
