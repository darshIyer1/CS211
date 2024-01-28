// Name: Darsh Iyer
// Date: 15 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: Github

import java.util.*;

public class Exercises11 {
    public static void main(String[] a) {
        // Build Integer array
        Integer[] arrayI = {7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();
        
        Integer[] arrayX = {1,3,-9,4,15,8,27,7,12,-5,31,-9,-1}; //created extra set to test better
        ArrayList<Integer> testListX = new ArrayList<Integer>();
        
        // Build an array of Strings
        String[] arrayS = {"Jane","Logan","Whitaker","Alyssa","Stefanie","Jeff","Kim","Sylvia"};
        ArrayList<String> testListS = new ArrayList<String>();

        
        // Build the Set of Strings:
        for (String s: arrayS) testListS.add(s);
        Set<String> testSetS = new TreeSet<String>(testListS);
        
        // Build the Set of Integers:
        Set<Integer> testSetI = new TreeSet<Integer>();       
        for (int i: arrayI) testSetI.add(i);

        // Build the Set of Integers:
        Set<Integer> testSetX = new TreeSet<Integer>();       
        for (int i: arrayX) testSetX.add(i);
        
        // Build a Map of Strings:
        Map<String, String> testMapSS = new HashMap<String, String>();
        Map<String, Integer> testMapSI = new HashMap<String, Integer>();
        String[] array2 = {"Jane2","Logan2","Whitaker2","Alyssa2","Stefanie2","Jeff2","Kim2","Sylvia2"};
        for (int i=0; i<arrayS.length; i++) testMapSS.put(arrayS[i], array2[i]);
        for (int i=0; i<arrayS.length; i++) testMapSI.put(arrayS[i], i);
         
        // Exercise 11.11 (text pg 759)
        System.out.println(testSetI);
        System.out.println("symmetricSetDifference="+symmetricSetDifference(testSetI,testSetX));
        
        // Exercise 11.12
        System.out.println(testListS);
        System.out.println("contains3="+contains3(testListS));
        
        // Exercise 11.13
        System.out.println(testMapSS);
        System.out.println("isUnique="+isUnique(testMapSS));
        
        // Exercise 11.14
        System.out.println(testMapSI);
        System.out.println("intersect="+intersect(testMapSI,testMapSI));
        
        // Exercise 11.15
        System.out.println(testListI);
        System.out.println("maxOccurrences="+maxOccurrences(testListI));
    }

    // BJP5 Exercise 11.11: symmetricSetDifference
    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (!result.add(num)) {
                result.remove(num);
            }
        }
        return result;
    }

    // BJP5 Exercise 11.12: contains3
    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) >= 3) {
                return true;
            }
        }
        return false;
    }

    // BJP5 Exercise 11.13: isUnique
    public static boolean isUnique(Map<String, String> map) {
        Set<String> values = new HashSet<>(map.values());
        return values.size() == map.size();
    }

    // BJP5 Exercise 11.14: intersect
    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                result.put(key, map1.get(key));
            }
        }
        return result;
    }

    // BJP5 Exercise 11.15: maxOccurrences
    public static int maxOccurrences(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return Collections.max(map.values());
    }
}
