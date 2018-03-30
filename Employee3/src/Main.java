import java.util.Scanner;
import java.time.LocalDate;
public class Main {

	
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please give the number of the employees");
		int n=0;
		n=scan.nextInt();
		Employee [] employees=new Employee[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Please give the details(name, birthday(year,month,day )) of the employees");
			String name=scan.next();
			LocalDate birthday=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
			employees[i]=new Employee(name, birthday);
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(employees[i].empBirthday());
		}
		
		/*for(int i=0;i<n;i++) {
			System.out.println(employees[i].toString());
		}
		
		employees[0].setRetiringYear(75);
		
		for(int i=0;i<n;i++) {
			System.out.println(employees[i].toString());
		}
		
		System.out.println("They has less then 5 years until pension");
		for(int i=0;i<n;i++) {
			if(employees[i].remainingYears()<5)
				System.out.println(employees[i]);
		}*/
		
		
		
		for (int i=0;i<n-1;i++) {
			int max=i;
 			for(int j=1;j<n;j++) {
				if(employees[max].remainingYears()<employees[j].remainingYears()) {
					max=j;
					
				}
				Employee temp=new Employee(employees[i].getEmployeeName(),employees[i].dateBirthday());
				employees[i]=new Employee(employees[max].getEmployeeName(),employees[max].dateBirthday());
				employees[max]=new Employee(temp.getEmployeeName(),temp.dateBirthday());;
			}
				
		}
		for(int i=0;i<n;i++) {
			System.out.println(employees[i].toString());
		}
		
		
		
		System.out.println();
		for (int i=0;i<n-1;i++) {
			int min=i;
 			for(int j=1;j<n;j++) {
				if(employees[min].remainingYears()<employees[j].remainingYears()) {
					min=j;
					
				}
				Employee temp=new Employee(employees[i].getEmployeeName(),employees[i].dateBirthday());
				employees[i]=new Employee(employees[min].getEmployeeName(),employees[min].dateBirthday());
				employees[min]=new Employee(temp.getEmployeeName(),temp.dateBirthday());;
			}
				
		}
		for(int i=0;i<n;i++) {
			System.out.println(employees[i].toString());
		}
		
	}

}
