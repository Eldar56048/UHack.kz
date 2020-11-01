package kz.edu.astanait.Repositories.interfaces;

import kz.edu.astanait.Models.User;

public interface IUserRepository extends IEntityRepository<User>{
    User getUserByUsernameAndPassword(String username,String password);
}
