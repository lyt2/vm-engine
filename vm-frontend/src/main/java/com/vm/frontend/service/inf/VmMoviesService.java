package com.vm.frontend.service.inf;

import com.vm.dao.qo.PageBean;
import com.vm.dao.qo.VmMoviesQueryBean;
import com.vm.frontend.service.dto.VmFilmmakersDto;
import com.vm.frontend.service.dto.VmMoviesDto;
import com.vm.frontend.service.dto.VmMoviesSrcVersionDto;
import com.vm.frontend.service.dto.VmTagsDto;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ZhangKe on 2017/12/12.
 */
public interface VmMoviesService {
    List<VmMoviesDto> getMovies(PageBean page, VmMoviesQueryBean query) throws Exception;

    Long getMoviesCount(PageBean page, VmMoviesQueryBean query) throws Exception;

    VmMoviesDto getMovie(Long movieId) throws Exception;

    void sendMovieImg(Long fileId,Integer width, HttpServletResponse response) throws Exception;

    void sendMovieSrc(Long fileId, HttpServletResponse response) throws Exception;

    List<VmTagsDto> getTagsOfMovie(Long movieId)throws Exception;

    List<VmFilmmakersDto> getMovieFilmmakers(Long movieId);

    List<VmMoviesSrcVersionDto> getMovieSrcVersions(Long movieId) throws Exception;

    String getMoviePosterUrl(Long movieId) throws Exception;

    List<VmMoviesDto> getAboutTagsMovies(PageBean page, VmMoviesQueryBean query) throws Exception;

    List<VmMoviesDto> getAboutFilmmakersMovies(PageBean page, VmMoviesQueryBean query);
}
