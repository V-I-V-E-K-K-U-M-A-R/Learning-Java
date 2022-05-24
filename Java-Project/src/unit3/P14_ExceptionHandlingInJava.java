package unit3;

public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
		  
		ABC5 obj=new ABC5();
		  obj.basicException();
		/* obj.handleExcption();
		 * obj.multipleCatch();
		 * obj.inputMismatchException();
		 * obj.stackOverFlowError();
		 * obj.indexOutOfBoundException();
		 * obj.nullPointerException();
		 * obj.useofThrow();
		 * obj.useofThrows&finally();
		 * obj.checkedAndUncheckedException();
		 * obj.manualExceptionThrow();
		 */
	}

}

class ABC5{
	void basicException() {
		
	}
	void handleException() {
		try {
			//senstive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}catch() {
			
		}
	}
    void multipleCatch() {
		
	}
    void inputMismatchException() {
	
    }
    void stackOverflowError(){ 
	
    }
    void indexOutOfBoundException() {
    	
    }
    void nullPointerException() {
    	
    }
    void useofThrow(int age) {
    	if(age<18) {
    		throw new Exception();
    	} else {
    		System.out.println("You are allowed to enter");
    	}
    }
    useofThrows&void Finally() {
    	
    }
}