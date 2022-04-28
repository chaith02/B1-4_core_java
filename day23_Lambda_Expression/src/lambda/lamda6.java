package lambda;

interface D
{
	int mul(int x,int y);
}

public class lamda6 {

	public static void main(String[] args) {
		// TODO Auto-generated methodstub
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(20,30));

	}

}
