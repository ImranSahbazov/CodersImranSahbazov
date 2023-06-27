package ImtahanaHazirliq4;

import java.lang.reflect.Field;

public class MyClass {

    @OnlyInteger
    private int myNumber;

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public void validateFields() {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(OnlyInteger.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(this);
                    if (!(value instanceof Integer)) {
                        throw new IllegalArgumentException(field.getName() + " field must be an integer.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


