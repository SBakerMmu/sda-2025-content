package authenticationstatemachine;

public final class Example {

    public static void run() {
        AuthenticationContext context = new AuthenticationContext();
//        System.out.format("User is %s%n", context.getStatus());

//        System.out.format("Login%n");
//        context.login();
//        System.out.format("User is %s%n", context.getStatus());
//
//        System.out.format("Login when already logged in%n");
//        context.login();
//        System.out.format("User is %s%n", context.getStatus());
//
//        System.out.format("Logout%n");
//        context.logout();
//        System.out.format("User is %s%n", context.getStatus());
//
//        System.out.format("Logout when already logged out%n");
//        context.logout();
//        System.out.format("User is %s%n", context.getStatus());


//        System.out.format("Login%n");
//        context.login();
//        System.out.format("User is %s%n", context);
//
//        for(int i = 0; i < 5; i++) {
//            System.out.format("Tick%n");
//            context.tick();
//            System.out.format("User is %s%n", context.getStatus());
//        }


        context = new AuthenticationContext();

        System.out.format("Login%n");
        context.login();
        System.out.format("User is %s%n", context);

        for(int i = 0; i < 5; i++) {
            System.out.format("Login%n");
            context.login();
            System.out.format("Tick%n");
            context.tick();
            System.out.format("User is %s%n", context.getStatus());
        }

        for(int i = 0; i < 5; i++) {
            System.out.format("Tick%n");
            context.tick();
            System.out.format("User is %s%n", context.getStatus());
        }

    }
}

