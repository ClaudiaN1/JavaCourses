public class Main {
    public static void main(String[] args) {
       // MyMongo mongo = new MyMongo();
       // mongo.insertOneDoc();
       // mongo.insertManyDocs();
       // mongo.queryCollection();
       // mongo.findAllDocs();
       // mongo.queryFilter();
       // mongo.updateDoc();
       // mongo.updateDocs();
       // mongo.deleteDoc();

        MyCodeMongo mongo = new MyCodeMongo();
//        mongo.insertPOJO();
//        mongo.insertList();
//        mongo.queryCollection();
//        mongo.updateDoc();
//        mongo.updateDocs();
//        mongo.replaceObj();
//        mongo.deleteDoc();
        mongo.deleteDocs();
    }
}
