import Execute.Execute;

public class Execute1 {
	public static void main(String[] args) {
	}

    public void method1() {
        System.out.println("method1");
    }

    @Execute
    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }

    @Execute
    public void method5() {
        System.out.println("method4");
    }
}