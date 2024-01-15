const apiUrl = 'https://jsonplaceholder.typicode.com/posts';
const postsPerPage = 1;
let currentPage = 1;

function fetchPosts() {
    const startIndex = (currentPage - 1) * postsPerPage;

    $.get(apiUrl, { _start: startIndex, _limit: postsPerPage }, function (posts) {
        displayPost(posts[0]); // Mostrar el primer post del array
        displayPagination();
    });
}

function displayPost(post) {
    const postList = $('#post-list');
    postList.empty();

    if (post) {
        postList.append(`
            <li class="list-group-item">
                <h3>${post.title}</h3>
                <p>${post.body}</p>
            </li>
        `);
    } else {
        postList.append('<li class="list-group-item">No hay posts disponibles.</li>');
    }
}

function displayPagination() {
    const pagination = $('#pagination');
    pagination.empty();

    $.get(apiUrl, function (allPosts) {
        const totalPages = allPosts.length;

        const prevArrow = `<li class="page-item ${currentPage === 1 ? 'disabled' : ''}">
                              <a class="page-link" href="#" data-page="${currentPage - 1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                              </a>
                           </li>`;
        const nextArrow = `<li class="page-item ${currentPage === totalPages ? 'disabled' : ''}">
                              <a class="page-link" href="#" data-page="${currentPage + 1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                              </a>
                           </li>`;

        const firstPageButton = `<li class="page-item">
                                        <a class="page-link" href="#" data-page="1">First</a>
                                </li>`;
        const lastPageButton = `<li class="page-item"><a class="page-link" href="#" data-page="${totalPages}">Last</a></li>`;

        pagination.append(firstPageButton);
        pagination.append(prevArrow);

        for (let i = currentPage - 1; i <= currentPage + 1; i++) {
            if (i > 0 && i <= totalPages) {
                const listItem = `<li class="page-item ${i === currentPage ? 'active' : ''}">
                                    <a class="page-link" href="#" data-page="${i}" aria-label="Post ${i}">
                                      ${i}
                                    </a>
                                  </li>`;
                pagination.append(listItem);
            }
        }

        pagination.append(nextArrow);
        pagination.append(lastPageButton);

        $('.page-link').on('click', function (e) {
            e.preventDefault();
            currentPage = parseInt($(this).data('page'));
            fetchPosts();
        });
    });
}

$(document).ready(function () {
    fetchPosts();
});