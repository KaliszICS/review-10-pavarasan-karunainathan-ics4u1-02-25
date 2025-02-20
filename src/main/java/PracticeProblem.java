public class PracticeProblem {
	static String pyramid(int height){
		String output = "";
		for(int row = 0; row < height; ++row){
			for(int spaces = 0; spaces < height-row-1; ++spaces){
				output += " ";
			}
			for(int asterisks = 0; asterisks < row+1; ++asterisks){
				output += "*";
				if(asterisks != row){
					output += " ";
				}
			}
			if(row != height-1){
				output += "\n";
			}
		}
		return output;
	}

	static String square(int height){
		String output = "";
		for(int row = 0; row < height; ++row){
			if(row == 0 || row == height-1){
				for(int asterisks = 0; asterisks < height; ++asterisks){
					output += "*";
				}
			}else{
				output += "*";
				for(int spaces = 1; spaces < height-1; ++spaces){
						output += " ";
				}
				output += "*";
			}
			if(row != height-1){
				output += "\n";
			}
		}
		return output;
	}

	static boolean hasLowercase(String str){
		for(int index = 0; index < str.length(); ++index){
			int charCode = (int)str.charAt(index);
			if(charCode >= 97 && charCode <= 122){
				return true;
			}
		}
		return false;
		/* Alternatively
		return str.toUpperCase() != str; */
	}

	public static void main(String args[]) {}
}
