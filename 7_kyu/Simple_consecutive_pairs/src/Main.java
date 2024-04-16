
/*
    In this Kata your task will be to return the count of pairs that have consecutive numbers as follows:
    pairs([1,2,5,8,-4,-3,7,6,5]) = 3
    The pairs are selected as follows [(1,2),(5,8),(-4,-3),(7,6),5]
    --the first pair is (1,2) and the numbers in the pair are consecutive; Count = 1
    --the second pair is (5,8) and are not consecutive
    --the third pair is (-4,-3), consecutive. Count = 2
    --the fourth pair is (7,6), also consecutive. Count = 3.
    --the last digit has no pair, so we ignore.
    More examples in the test cases.

    Good luck!

    Please also try Simple time difference
*/

public class Main {

    static int simple_pair(int[] pares){
        int cantidad_de_pares = 0;

        for (int i = 0; i < pares.length; i++) {
            int siguiente_elemento = i + 1;

            if (siguiente_elemento < pares.length){
                if (pares[i] + 1 == pares[siguiente_elemento] || pares[i] - 1 == pares[siguiente_elemento]){
                    cantidad_de_pares += 1;
                }
            }
            i += 1;
        }
        return cantidad_de_pares;
    }

    public static void main(String[] args) {

        int[] pares = {1,2,5,8,-4,-3,7,6,5};
        System.out.println(simple_pair(pares));

    }
}