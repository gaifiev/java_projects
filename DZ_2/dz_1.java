// ДЗ 1.
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package DZ_2;

public class dz_1 {
    public static void main(String[] args) {
        String sql = "select * from students where ";
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String sql_request = new StringBuilder(sql).append(ParameterToFilter(json)).toString();
        System.out.println(sql_request);
    }

    public static String ParameterToFilter(String filter) {
        String[] what = filter.substring(1, filter.length() - 1).split(", ");
        StringBuilder where = new StringBuilder();
        boolean or = true;
        for (String i : what) {
            String[] j = i.split(":");
            if (!j[1].equals("\"null\"")) {
                if (or)
                    or = false;
                else
                    where.append(" and ");
                where.append(j[0].substring(1, j[0].length() - 1));
                where.append(" = '");
                where.append(j[1].substring(1, j[1].length() - 1));
                where.append("'");
            }
        }
        return where.toString();
    }
}
