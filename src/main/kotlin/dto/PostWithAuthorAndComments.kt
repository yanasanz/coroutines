package dto

data class PostWithAuthorAndComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>,
)