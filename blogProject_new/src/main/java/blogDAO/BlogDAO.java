package blogDAO;

import blogDTO.BlogDTO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class BlogDAO {

    final private SqlSession sqlSession;

    public BlogDTO getData(Integer postIdx) {
        return sqlSession.selectOne("BlogMapper.getData", postIdx);
    }

    public List<BlogDTO> getList() {
        return sqlSession.selectOne("BlogMapper.getList");
    }

    public void insertData(BlogDTO blogDTO) {
        sqlSession.selectOne("BlogMapper.insertData", blogDTO);
    }

    public void deleteData(Integer postIdx) {
        sqlSession.selectOne("BlogMapper.deleteData", postIdx);
    }

}
