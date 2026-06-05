public class ProxyService implements Service{
    private Service service;
    ProxyService(Service service){
        this.service=service;
    }
    @Override
    public void getUser(User currentUser, User targetUser) {
        service.getUser(currentUser, targetUser);
    }
    @Override
    public void deleteUser(User currentUser, User targetUser) {
        if(currentUser.name.equals(targetUser.name)
            || currentUser.role==Role.Admin
        ){
            service.deleteUser(currentUser, targetUser);
        }else{
            System.out.println(currentUser.name +" is not authorize");
        }
    }
}
