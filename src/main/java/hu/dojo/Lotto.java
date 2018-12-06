package hu.dojo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Keszits olyan programkodot ami kigeneralja a megadott intervallumban a lotto szamokat.
 * Megadhato hogy mennyi szamot huzzon ki.
 */
public class Lotto {

    public static void main(String[] args) {

        System.out.println("begin");
        Lotto lotto = new Lotto();

        System.out.println(lotto.generate(1, 100, 6));
        System.out.println(lotto.generate(100, 200, 15));

        System.out.println(lotto.generate2(20, 30, 10));
        System.out.println(lotto.generate2(3, 11, 5));

        System.out.println(lotto.generate3(1, 55, 12));
        System.out.println(lotto.generate3(1, 91, 90));
        System.out.println("end");
    }

    //    Megoldas 1 Best for me
    public Set<Integer> generate(int from, int to, int count) {
        if (from < 1 || to <= from || count < 1 || count > to - from) {
            throw new IllegalArgumentException("Incorrect arguments");
        }

        Random randomImpl = new RandomImpl();
        Set<Integer> retval = new HashSet<Integer>();
        while (retval.size() < count) {
            retval.add(Math.abs(randomImpl.nextInt() % to));
        }
        return retval;
    }

    //    Megoldas 2
    public Set<Integer> generate2(int from, int to, int count) {
        if (from < 1 || to <= from || count < 1 || count > to - from) {
            throw new IllegalArgumentException("Incorrect arguments");
        }

        Random randomImpl = new RandomImpl();
        Set<Integer> retval = new HashSet<Integer>();
        for (int i = 0; retval.size() < count; i++) {
            Integer randomNumber = Math.abs(randomImpl.nextInt()) % to + 1;
            if (randomNumber > from) {
                retval.add(randomNumber);
            }
        }
        return retval;
    }

    //    Megoldas 3
    public Set<Integer> generate3(int from, int to, int count) {
        if (from < 1 || to <= from || count < 1 || count > to - from) {
            throw new IllegalArgumentException("Incorrect arguments");
        }
        int interval = to - from;
        Set<Integer> nums = new HashSet<>();
        RandomImpl randomImpl = new RandomImpl();
        while (nums.size() < count) {
            int randomNum = randomImpl.nextInt();
            if (randomNum < 0) {
                randomNum *= -1;
            }
            nums.add(randomNum % interval + from);
        }
        return nums;
    }

    //    Megoldas 4
    public Set<Integer> generate4(int from, int to, int count) {
        Set<Integer> interval = new HashSet<Integer>();
        Random rand = new RandomImpl();

        if (from < 1 || to <= from || count < 1 || count > to - from) {
            throw new IllegalArgumentException("Incorrect arguments");
        }

        while (interval.size() < count) {
            Integer generated = Math.abs(rand.nextInt()) % to;
            if (from <= generated) {
                interval.add(generated);
            }
        }
        return interval;
    }


    interface Random {
        int nextInt();
    }

    static class RandomImpl implements Random {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        @Override
        public int nextInt() {
            return random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }
}
