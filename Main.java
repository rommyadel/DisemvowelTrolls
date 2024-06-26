public class Main{
    public static void main(String[] args) {
            // Test cases
            System.out.println(removeVowels("This website is for losers LOL!")); // Output: "Ths wbst s fr lsrs LL!"
            System.out.println(removeVowels("Hello World")); // Output: "Hll Wrld"
            System.out.println(removeVowels("aeiouAEIOU")); // Output: ""
            System.out.println(removeVowels("")); // Output: ""
        }

        public static String removeVowels(String str) {
            // Convert the string to a character array
            char[] chars = str.toCharArray();

            // Create a StringBuilder to store the result
            StringBuilder result = new StringBuilder();

            // Iterate through each character in the array
            for (char c : chars) {
                // Check if the character is not a vowel (both lowercase and uppercase)
                if (!isVowel(c)) {
                    result.append(c); // Append non-vowel characters to the result StringBuilder
                }
            }

            // Convert StringBuilder to String and return
            return result.toString();
        }

        // Helper method to check if a character is a vowel
        private static boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1; // Check if the character is present in the vowels string
        }
    }
