package finbarre.Complementary_DNA;

public class DnaStrand {
	public static String makeComplement(String dna) {
		String c = null;
		char complementArr[] = new char[dna.length()];
		for (int i =0 ;i< dna.length();i++)
	    {
			switch (dna.substring(i,i+1)) {
			case "A":
				c = "T";
				complementArr[i]=c.charAt(0);
				break;
			case "T":
				c = "A";
				complementArr[i]=c.charAt(0);
				break;
			case "C":
				c = "G";
				complementArr[i]=c.charAt(0);
				break;
			case "G":
				c = "C";
				complementArr[i]=c.charAt(0);
				break;

			default:
				break;
			}
	    }
		
		return String.valueOf(complementArr);
	  }
}
