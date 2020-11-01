package kz.edu.astanait.Repositories.interfaces;

import kz.edu.astanait.Models.Appeal;

public interface IAppealRepository extends IEntityRepository<Appeal>{
    Appeal getAppealById(int id);
    Appeal getAppealByIdAndCode(int id,String code);
}
