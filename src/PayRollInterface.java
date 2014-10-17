import TerminalIO.*;

public class PayRollInterface{
    
public static void main(String[] args){

KeyboardReader kr = new KeyboardReader();

	Employee empl; //The employee
	String name; //The name
	int type; //The type
	double rate; //Hourly rate
	int hours; //The hours worked
	String prompt; //The user prompt
	empl= new Employee();
        
while(true){
    System.out.println ("Enter employee data");
    name = kr.readLine(" Name (or <enter> to quit):" );
    if(!(empl.setName(name))) break;
        

while(true){ //Type the name in and break if blank

	prompt = "Type (" + empl.getTypeRules()+ "): ";
	type= kr.readInt(prompt);
	if(empl.setType(type)) break;
	
}

while(true){ //Get the type until it is valid

	prompt = "Hourly Rate (" + empl.getRateRules()+ "): ";
	rate = kr.readDouble(prompt);
	if(empl.setRate(rate)) break; 

}

while(true){

	prompt = "Hours (" + empl.getHoursRules()+ "): ";
	hours = kr.readInt(prompt);
	if(empl.setHours(hours)) break;
}

System.out.println("The weekly pay for ");
System.out.println(empl.getName());
System.out.println(" is $" + empl.getPay());
}
}

}



