package prefixSums;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {

        int[][] D = new int[S.length()+1][3];

        for (int i = 0; i < S.length()+1; i++) {
            if (i == 0) {
                D[i][0] = 0;
                D[i][1] = 0;
                D[i][2] = 0;
            } else {
                switch (S.charAt(i-1)) {
                    case 'A':
                        D[i][0] = D[i-1][0] + 1;
                        D[i][1] = D[i-1][1];
                        D[i][2] = D[i-1][2];
                        break;
                    case 'C':
                        D[i][0] = D[i-1][0];
                        D[i][1] = D[i-1][1] + 1;
                        D[i][2] = D[i-1][2];
                        break;
                    case 'D':
                        D[i][0] = D[i-1][0];
                        D[i][1] = D[i-1][1];
                        D[i][2] = D[i-1][2] + 1;
                        break;
                    default:
                        D[i][0] = D[i-1][0];
                        D[i][1] = D[i-1][1];
                        D[i][2] = D[i-1][2];
                        break;
                }
            }
        }

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            if (D[Q[i]+1][0] - D[P[i]][0] > 0) {
                result[i] = 1;
            } else if (D[Q[i]+1][1] - D[P[i]][1] > 0) {
                result[i] = 2;
            } else if (D[Q[i]+1][2] - D[P[i]][2] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return  result;
    }
}
