package reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;

import org.springframework.stereotype.Component;
import reggie.dto.SetmealDto;
import reggie.entity.Setmeal;

import java.util.List;

@Component
public interface SetmealService extends IService<Setmeal> {
    void removeWithDish(List<Long> ids);

    void saveWithDish(SetmealDto setmealDto);
}

