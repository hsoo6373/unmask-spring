Vue.component('comment-dialog',{
    template: '<div class="dialog-mask">' +
                   '<div class="c-window">' +
                       '<div class="c-header">' +
                           '<h1 class="c-title">Comment</h1>' +
                           '<h2 class="c-author">{{author}}</h2>' +
                       '</div>' +
                       '<div class="c-container">' +
                           '<div class="c-box">' +
                               '<button class="button-previous-comment" @click="$emit(\'prev-comment\')"><</button>' +
                               '<div class="c-content">' +
                                   '<p>{{content}}</p>' +
                               '</div>' +
                               '<button class="button-next-comment" @click="$emit(\'next-comment\')">></button>' +
                           '</div>' +
                           '<img class="button-up-vote" src="https://www.flaticon.com/svg/static/icons/svg/1152/1152935.svg" />' +
                       '</div>' +
                       '<p style="font-size: xx-large; color: white;">×</p>' +
                   '</div>',
    props: ['author', 'content']
});

var commentDiv = new Vue({
    el: '#comment-div',
    data: {
        showDialog: false,
        commentList: [
            {id:0, authorID:111, content:'comment 1'},
            {id:1, authorID:222, content:'comment 2'},
            {id:2, authorID:333, content:'comment 3'},
        ],
        currentComment: {},
    },
    created: function(){    this.currentComment = this.commentList[0];    },
    methods: {
        previousComment: function(){
            if(this.currentComment.id==0){
                alert("You've reached the first comment");
            } else {
                this.currentComment = this.commentList[this.currentComment.id-1];
            }
        },
        nextComment: function(){
            if(this.currentComment.id==this.commentList.length-1){
                alert("You've reached the end");
            } else {
                this.currentComment = this.commentList[this.currentComment.id+1];
            }
        },
    },
});
