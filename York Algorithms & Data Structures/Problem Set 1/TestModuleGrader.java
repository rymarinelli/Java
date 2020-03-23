import java.util.*;
public class TestModuleGrader {

	public static void main(String[] args) {
		ModuleGrader test = new ModuleGrader(0);
		System.out.println( test.getMark());
		
		
		// Tests output for a range of values
		for(int i = 0 ; i <= 100; i+= 5)
        { 
			test.setMark(i);
			System.out.println(test.getMark());
			System.out.println(test.getValidModuleMark(test.getMark()));
			System.out.println(test.gradeModule(test.getMark()));	
			
        }
		
		//Testing for when an invalid number is selected
		System.out.println(test.getValidModuleMark(test.setMark(105)));
	    System.out.println(test.gradeModule(105));	
		
		
		test.startModuleGrading();
		

		
	}

}
