import java.util.Calendar;

public class EstonianID implements PersonalCodeBehaviour {
    public String gender;
    public String id_code = "39205026527";
    public String month = "";

    public String getGender() {
        int genderNumber = Integer.parseInt(id_code.substring(0, 1));
        if (genderNumber % 2 == 0) {
            gender = "naine";
        } else {
            gender = "mees";
        }
        // TODO Auto-generated method stub
        return gender;
    }

    public String getDay() {
        // TODO Auto-generated method stub
        int d1 = Integer.parseInt(id_code.substring(5, 6));
        int d2 = Integer.parseInt(id_code.substring(6, 7));
        String id_age = String.valueOf(d1) + String.valueOf(d2);
        return id_age;
    }

    public String getMonth() {
        // TODO Auto-generated method stub
        int m1 = Integer.parseInt(id_code.substring(3, 4));
        int m2 = Integer.parseInt(id_code.substring(4, 5));

        if (m1 == 0 && m2 == 1) {
            month = "jaanuar";
        }
        if (m1 == 0 && m2 == 2) {
            month = "veebruar";
        }
        if (m1 == 0 && m2 == 3) {
            month = "märts";
        }
        if (m1 == 0 && m2 == 4) {
            month = "aprll";
        }
        if (m1 == 0 && m2 == 5) {
            month = "mai";
        }
        if (m1 == 0 && m2 == 6) {
            month = "juuni";
        }
        if (m1 == 0 && m2 == 7) {
            month = "juuli";
        }
        if (m1 == 0 && m2 == 8) {
            month = "august";
        }
        if (m1 == 0 && m2 == 9) {
            month = "september";
        }
        if (m1 == 1 && m2 == 0) {
            month = "oktoober";
        }
        if (m1 == 1 && m2 == 1) {
            month = "november";
        }
        if (m1 == 1 && m2 == 2) {
            month = "detsember";
        }

        return month;
    }

    public int getAge() {
        // TODO Auto-generated method stub
        int a1 = Integer.parseInt(id_code.substring(1, 2));
        int a2 = Integer.parseInt(id_code.substring(2, 3));
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(a1);
        System.out.println(a2);
        int muutuja = a1+a2;
        System.out.println(muutuja);
        int age = currentYear - (19 + ((a1 * 10) + a2)); // peab vist stringina tegema seda
        

        return age;
    }

}