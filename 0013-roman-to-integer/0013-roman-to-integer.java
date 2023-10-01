class Solution {
    public int romanToInt(String s) {
          // Create a HashMap to store integer to string mappings
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        int i =0;
        int x = 0 ;
        int sum = x ;
        String value;
        String next;

       while(i <= s.length()-1)
        {
            value = String.valueOf(s.charAt(i));
            if (value.equals("I") || value.equals("X") || value.equals("C")) {
                if (i+1 <= s.length()-1) {
                    next = String.valueOf(s.charAt(i + 1));
                    switch (value) {
                        case "I":
                            if (next.equals("V")) {
                                x = 4;
                                sum = sum + x;
                                i= i+2;
                            } else if (next.equals("X")) {
                                x = 9;
                                sum = sum + x;
                                i= i+2;
                            }else {
                                x = hashMap.get(value);
                                sum = sum + x;
                                i++;
                            }
                            break;
                        case "X":
                            if (next.equals("L")) {
                                x = 40;
                                sum = sum + x;
                                i= i+2;
                            } else if (next.equals("C")) {
                                x = 90;
                                sum = sum + x;
                                i= i+2;
                            }else {
                                x = hashMap.get(value);
                                sum = sum + x;
                                i++;
                            }
                            break;
                        case "C":
                            if (next.equals("D")) {
                                x = 400;
                                sum = sum + x;
                                i= i+2;
                            } else if (next.equals("M")) {
                                x = 900;
                                sum = sum + x;
                                i= i+2;
                            }else {
                                x = hashMap.get(value);
                                sum = sum + x;
                                i++;
                            }
                            break;
                        default:
                            x = hashMap.get(value);
                            sum = sum + x;
                            i++;
                            break;
                    }
                } else {
                    x = hashMap.get(value);
                    sum = sum + x;
                    i++;
                }
            } else {
                x = hashMap.get(value);
                sum = sum + x;
                i++;
            }

        }
        return sum;
    }
}