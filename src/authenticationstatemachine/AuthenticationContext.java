package authenticationstatemachine;

class AuthenticationContext {

     class LoggedIn implements State {

        private static int MAXTICKS = 3;
        private int count = MAXTICKS;

        @Override
        public void login() {
            count = MAXTICKS;
            state = this;
        }

        @Override
        public void logout() {
            state = new LoggedOut();
        }

        @Override
        public void tick() {
            if(--count == 0)
            {
                state = (new LoggedOut());
            }
        }

         @Override
         public String toString() {
             return "Logged In";
         }
     }

    class LoggedOut implements State {

        @Override
        public void login() {
            state = new LoggedIn();
        }

        @Override
        public void logout() {
            state = this;
        }

        @Override
        public void tick() {
            //ignore
        }

        @Override
        public String toString() {
            return "Logged Out";
        }

    }

    State state;
    public AuthenticationContext() {
        state = new LoggedOut();
    }

    public void tick()  {
        this.state.tick();
    }
    public void login() {
        this.state.login();
    }
    public void logout() {
        this.state.logout();
    }

    @Override
    public String toString() {
        return getStatus();
    }

    String getStatus() {
        return this.state.toString();
    }
}
