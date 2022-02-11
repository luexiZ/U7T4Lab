import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAlgorithms
{
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.  Use indexOf instead of contains
     *  for AP practice! (although in reality, contains is preferred)
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for(String item : stringList)
        {
            if(item.indexOf(target) != -1)
            {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double sum = 0;
        for(int i : intList)
        {
            sum += i;
        }
        double average= sum / intList.size();
        int counter = 0;

        for (int j : intList)
        {
            if(j < average)
            {
               counter ++;
            }
        }
        return counter;

    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++)
        {
            if(wordList.get(i).substring(wordList.get(i).length() -1).equals("s"))
            {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }

    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int min = intList.get(0);
        for(int num : intList)
        {
            if(num < min)
            {
                min = num;
            }
        }
        int finalIndex = 0;
        for(int i = 0; i < intList.size(); i++)
        {
            if(intList.get(i) == min)
            {
                finalIndex = i;
                break;
            }
        }
        return finalIndex;
    }


    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {

        for(int i = 0; i < numList1.size(); i++)
        {
            if(numList1.get(i) != numList2.get(i))
            {
                return false;
            }
        }
        return true;

    }

    /** Removes all elements from numList that are ODD Integers.
     *
     *  DOES mutate (modify) elements in numList
     *  PRECONDITION: numList1.size() > 0
     *
     *  @param numList1  arraylist of Integers
     */
    public static void removeOdds(ArrayList<Integer> numList)
    {
        for(int i = 0; i < numList.size(); i++)
        {
            if(numList.get(i) % 2 == 1)
            {
                numList.remove(i);
                i--;
            }
        }
    }

    /** Removes all elements from wordList that contain an a, e, i , and/or o.
     *  All other words (i.e. those that have u and/or y as the vowel
     *  such as "ugh" or "sly", or no vowels, like "psh"), add a duplicate of
     *  that element to wordList at an adjacent index.
     *
     *  Assume all words have lowercase letters (i.e. no need to check for case)
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void wackyVowels(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++)
        {
            if(wordList.get(i).indexOf("a") !=  -1 ||
                    wordList.get(i).indexOf("e") !=  -1 ||
                    wordList.get(i).indexOf("i") !=  -1 ||
                    wordList.get(i).indexOf("o") !=  -1)
            {
                wordList.remove(i);
                i--;
            }
            else
            {
                wordList.add(i + 1, wordList.get(i));
                i++;
            }
        }
    }
    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for (int i  = 0; i < intList.size(); i++)
        {
            for(int j = i + 1; j < intList.size(); j++)
            {
                if(intList.get(i).equals(intList.get(j)))
                {
                    intList.remove(j);
                    j--;
                }
            }
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++)
        {
            wordList.add(i +1, wordList.get(i).toUpperCase());
            i ++;
        }
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        int originalSize = wordList.size();
        for(int i = 0; i < originalSize; i++)
        {
            wordList.add(wordList.get(i).toUpperCase());
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence)
    {
        ArrayList<String> returnSentence = new ArrayList<String>();
        String separate = sentence;

        int index = 0;
        while (separate.indexOf(" ") != -1)
        {
            index = separate.indexOf(" ");
            String word = separate.substring(0, index);
            returnSentence.add(0, word);
            separate = separate.substring(index + 1);
        }
        returnSentence.add(0, separate);
        return returnSentence;
    }

    public static void moveBWords(ArrayList<String> wordList)
    {
        int increaseIndex = 0;
        for(int i = 0; i < wordList.size(); i++)
        {

            if(wordList.get(i).indexOf("b") != -1)
            {
                wordList.add(increaseIndex, wordList.remove(i));
                increaseIndex ++;
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList)
    {
        ArrayList<Integer> modes = new ArrayList<Integer>();

        int max = 1;
        for(int i = 0; i < numList.length; i++)
        {
            int counter = 1;
            for(int j = i + 1; j < numList.length; j++)
            {
                if(numList[i] == numList[j])
                {
                    counter++;
                }
            }
            if(counter > max)
            {
                max = counter;
                modes.clear();
                modes.add(numList[i]);

            }
            else if(counter == max && counter  != 1)
            {
                modes.add(numList[i]);
            }
        }
        return modes;

    }







}

