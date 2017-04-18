package controllers

import javax.inject._

import medline.articles.persistence.SerDe
import medline.articles.result.{Result,DistinctAuthors}
import play.api.mvc._


@Singleton
class HomeController @Inject() extends Controller {

  def index = Action {

    val result = SerDe.deSerialize("../op.tmp").asInstanceOf[Result]
    val distinctAuthors = SerDe.deSerialize("../author.tmp").asInstanceOf[DistinctAuthors]

    Ok(views.html.index("Matrix of Number of Articles Co-Authored.",result,distinctAuthors.authors))
  }

}
