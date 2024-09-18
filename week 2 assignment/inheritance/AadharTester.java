public class AadharTester {
	public static void main(String[] args) {
		Aadhar aadhar=new Aadhar();
		
		aadhar.setUidId(126376464623l);
		aadhar.setUidname("chetan");
		aadhar.setAdress("bgk");
		
		Aadhar aadha=new Aadhar();
		
		aadha.setUidId(46464464623l);
		aadha.setUidname("ganesh");
		aadha.setAdress("guledgudda");
		
		System.out.println(aadhar);
		System.out.println(aadha);
	}

}