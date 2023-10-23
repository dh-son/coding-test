package sieveOfEratosthenes;

import java.util.ArrayList;
import java.util.List;

public class CountSemiprimes {

    public int[] solution(int N, int[] P, int[] Q) {

        int[] divisors = new int[N + 1];

        divisors[0] = 1;
        divisors[1] = 1;

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < N + 1; i++) {
            if (divisors[i] == 0) {
                primes.add(i);
            }

            for (int j = 2 * i; j < N; j += i) {
                divisors[j] = 1;
            }
        }

        int[] semiprimes = new int[N + 1];
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i; j < primes.size(); j++) {
                if (primes.get(i) * primes.get(j) > N) {
                    break;
                }

                semiprimes[primes.get(i) * primes.get(j)] = 1;
            }
        }

        for (int i = 1; i < semiprimes.length; i++) {
            semiprimes[i] += semiprimes[i -1];
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            result[i] = semiprimes[Q[i]] - semiprimes[P[i] - 1];
        }

        return result;
    }
}
