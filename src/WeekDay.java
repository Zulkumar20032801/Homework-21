public enum WeekDay {
    MONDAY(){
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну жава окуйм.");
        }
    },
    TUESDAY(){
        @Override
        public void method() {
            System.out.println("Шейшемби куну практика болот.");
        }},
    WEDNESDAY(){
        @Override
        public void method() {
            System.out.println("Шаршемби куну теория отобуз.");
        }},
    THURSDAY(){
        @Override
        public void method() {
            System.out.println("Бейшемби куну англис тил сабагын окуйм.");
        }},
    FRIDAY(){
        @Override
        public void method() {
            System.out.println("Жума куну StringBuilder,String pool темаларын отобуз.");
        }},
    SATURDAY(){
        @Override
        public void method() {
            System.out.println("Ишемби куну StringBuilder,String pool темаларына карата практика болот.");
        }},
    SUNDAY(){
        @Override
        public void method() {
            System.out.println("Жекшемби куну сабак болбойт.");
        }};

    public abstract void method();


}
