public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("D:\\CS 361 Pace\\CS361GitHubRepo\\CS361\\ScannerParser\\Parser\\prog2.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}