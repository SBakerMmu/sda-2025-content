package authenticationstatemachine;

interface State {
    void login();
    void logout();
    void tick();
}
