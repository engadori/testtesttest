package blogService;

import blogDAO.BlogDAO;
import blogDTO.BlogDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogDAO blogDAO;

    public String startUp() {
        return "hello!";
    }

    public BlogDTO getData(BlogDTO blogDTO) {
        return blogDAO.getData(blogDTO.getPostIdx());
    }

    public List<BlogDTO> getList(BlogDTO blogDTO) {
        return blogDAO.getList();
    }

    public void insertData(BlogDTO blogDTO) {
        blogDAO.insertData(blogDTO);
    }

    public void deleteData(Integer postIdx) {
        blogDAO.deleteData(postIdx);
    }
}
