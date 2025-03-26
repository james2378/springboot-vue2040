const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongguoshanximinsuwang/",
            name: "zhongguoshanximinsuwang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongguoshanximinsuwang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中国陕西民俗网"
        } 
    }
}
export default base
