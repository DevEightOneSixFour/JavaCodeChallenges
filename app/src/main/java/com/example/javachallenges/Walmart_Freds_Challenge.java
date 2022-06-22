package com.example.javachallenges;

/* backend

        GET /api/todos
        POST /api/todos
        PUT /api/todos?id=""
        DELETE /api/todos?id=""

// Local Database
        {
        "todo_list": [
        { "id":"&*(HJK)", "name":"todo1"},
        { "id":"%^@!!", "name":"todo2"},
        { "id":"()(*)", "name":"todo3"},
        { "id":"&^()*))", "name":"todo4"}
        ]
        }

// From Network
        {
        "todo_list": [
        { "id":"&*(HJK)", "name":"todo1"},


        { "id":"&^()*))", "name":"todo4"},
        { "id":"&^()**&^^*", "name":"todo5"}
        ]
        }

        for(todo in networkList) {
            if(localList.contains(todo) && !networkList.contains(todo) {
                localList.remove(todo)
            }
            if (!localList.contains(todo)) {
                localList.add(todo)
            }
        }

// client

public class TodoModel {
    public String id;
    public String name;
}

    getDBTodos()
    sqlRemoveTodo(TodoModel todo)

    // in a sqlite DB; you ll have 1 table (TODO) : ID, NAME
    public void requestParseAndSave() {

        // perform the network request

        // parse the json response

        List<TodoModel> todoNetworkList = getNetworkTodos();
        List<TodoModel> todoLocalList = getDBTodos(); // getting local list
        for (TodoModel todoNetwork : todoNetworkList) {

            sqlAddTodoIfNotExists(todoNetwork); // this handles adding the todo if it does not exist
            if(todoLocalList.contains(todo && !todoNetworkList(todo)){
                todoLocalList.remove(todo);
            }
        }

        // here;
        // TODO : we should take care about stales refs
    }

 */

/**
 * My Psuedo code
 * <p>
 * local {
 * todo1…..
 * todo2….
 * todo3....
 * todo4…..
 * }
 * <p>
 * Single Source of Truth
 * network {
 * todo1…..
 * <p>
 * <p>
 * todo4…
 * todo5….
 * }
 * <p>
 * for(todo in networkList) {
 * <p>
 * //	checks if network has removed todos
 * // if so remove it from the localList
 * if (localList.contains(todo) && !network list.contains(todo)) {
 * localList.remove(todo)
 * }
 * <p>
 * //checks if network has todos that are not in local
 * if(!localList.contains(todo)) {
 * local.add(todo)
 * }
 * <p>
 * }
 * <p>
 * 5/26 update, should actually remove the old todos
 * // get database todos
 * List<TodoModel> localList = getDBTodos(); 
 * //remove unneeded todos
 * for(TodoModel todo: localList) {
 *  if (!todoNetworkList.contains(todo)) { 
 * sqlRemoveTodo(todo)
 * }
 * <p>
 * }
 */
public void requestParseAndSave() {
// parse the json response

    List<TodoModel> todoNetworkList=getNetworkTodos();
    List<TodoModel> todoLocalList=getDBTodos(); // added local list reference

        for(TodoModel todoNetwork:todoNetworkList) {
            sqlAddTodoIfNotExists(todoNetwork);
        }

        // here;
        // TODO : we should take care about stales refs
        for(TodoModel currentTodo:local){
            if(!todoNetworkList.contains(currentTodo))
                // function to remove from todoLocalList
                sqlRemoveTodo(currentTodo);
            }
        }


