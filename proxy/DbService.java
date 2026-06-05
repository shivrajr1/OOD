public class DbService implements Service{
    @Override
    public void getUser(User currentUser, User targetUser) {
        System.out.println(currentUser.name +" is get user "+targetUser.name);
    }
    @Override
    public void deleteUser(User currentUser, User targetUser) {
        System.out.println(targetUser.name+" is deleted by "+currentUser.name);
    }
}
