import java.util.Random;

public class StudyBuddies {
    public static Student[] groupFinder() {
        Random random = new Random();
        Student[] studentArray = new Student[6];
        for (int i = 0; i < 6; i++) {
            studentArray[i] = Student.values()[(random.nextInt(Student.values().length))];
        }
        return studentArray;
    }
    public static void groupAnalyzer(Student[] studentArray) {
        int p = 0, c = 0, l = 0, d = 0, t = 0, q = 0;
        System.out.println("The following types of students are in your study group:");
        for (int i = 0; i < studentArray.length; i++) {
            switch (studentArray[i]) {
            case PROCRASTINATOR:
                p++;
                break;
            case CURVE_BREAKER:
                c++;
                break;
            case LATECOMER:
                l++;
                break;
            case DAYDREAMER:
                d++;
                break;
            case TROUBLEMAKER:
                t++;
                break;
            case QUIET_ACHIEVER:
                q++;
                break;
            default:
                System.out.println("Invalid student type!");
                break;
            }
        }
        System.out.printf("PROCRASTINATOR %d\nCURVE_BREAKER %d\nLATECOMER "
            + "%d\nDAYDREAMER %d\nTROUBLEMAKER %d\nQUIET_ACHIEVER %d\n", p, c, l, d, t, q);
    }
    public static void groupScores(Student[] group1, Student[] group2) {
        int p1 = 0, c1 = 0, l1 = 0, d1 = 0, t1 = 0, q1 = 0;
        int p2 = 0, c2 = 0, l2 = 0, d2 = 0, t2 = 0, q2 = 0;
        int score1 = 0, score2 = 0;
        for (int i = 0; i < group1.length; i++) {
            switch (group1[i]) {
            case PROCRASTINATOR:
                p1++;
                break;
            case CURVE_BREAKER:
                c1++;
                break;
            case LATECOMER:
                l1++;
                break;
            case DAYDREAMER:
                d1++;
                break;
            case TROUBLEMAKER:
                t1++;
                break;
            case QUIET_ACHIEVER:
                q1++;
                break;
            default:
                System.out.println("Invalid student type!");
                break;
            }
        }
        score1 = p1 * Student.valueOf("PROCRASTINATOR").ordinal() + c1 * Student.valueOf("CURVE_BREAKER").ordinal()
            + l1 * Student.valueOf("LATECOMER").ordinal() + d1 * Student.valueOf("DAYDREAMER").ordinal()
            + t1 * Student.valueOf("TROUBLEMAKER").ordinal() + q1 * Student.valueOf("QUIET_ACHIEVER").ordinal();
        for (int i = 0; i < group2.length; i++) {
            switch (group2[i]) {
            case PROCRASTINATOR:
                p2++;
                break;
            case CURVE_BREAKER:
                c2++;
                break;
            case LATECOMER:
                l2++;
                break;
            case DAYDREAMER:
                d2++;
                break;
            case TROUBLEMAKER:
                t2++;
                break;
            case QUIET_ACHIEVER:
                q2++;
                break;
            default:
                System.out.println("Invalid student type!");
                break;
            }
        }
        score2 = p2 * Student.valueOf("PROCRASTINATOR").ordinal() + c2 * Student.valueOf("CURVE_BREAKER").ordinal()
            + l2 * Student.valueOf("LATECOMER").ordinal() + d2 * Student.valueOf("DAYDREAMER").ordinal()
            + t2 * Student.valueOf("TROUBLEMAKER").ordinal() + q2 * Student.valueOf("QUIET_ACHIEVER").ordinal();
        if (score1 > score2) {
            System.out.println("The former is predicted to perform better than the latter.");
        } else if (score1 < score2) {
            System.out.println("The latter is predicted to perform better than the former.");
        } else {
            System.out.println("Thetwo groups are predicted to perform equally well.");
        }
    }
    public static void main(String[] args) {
        Student[] group1 = groupFinder();
        groupAnalyzer(group1);
        Student[] group2 = groupFinder();
        groupAnalyzer(group2);
        groupScores(group1, group2);
    }
}
