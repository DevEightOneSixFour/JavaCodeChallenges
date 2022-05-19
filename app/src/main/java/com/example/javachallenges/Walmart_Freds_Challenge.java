package com.example.javachallenges;

/* backend

        GET /api/todos
        POST /api/todos
        PUT /api/todos?id=""
        DELETE /api/todos?id=""

        {
        "todo_list": [
        { "id":"&*(HJK)", "name":"todo1"},
        { "id":"%^@!!", "name":"todo2"},
        { "id":"()(*)", "name":"todo3"},
        { "id":"&^()*))", "name":"todo4"}
        ]
        }

        {
        "todo_list": [
        { "id":"&*(HJK)", "name":"todo1"},


        { "id":"&^()*))", "name":"todo4"},
        { "id":"&^()**&^^*", "name":"todo5"}
        ]
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
 *
 * 	local {
 * 	todo1…..
 * 	todo2….
 *   todo3....
 *   todo4…..
 * }
 *
 * Single Source of Truth
 * 	network {
 * 		todo1…..
 *
 *
 * 		todo4…
 * 		todo5….
 *        }
 *
 * for(todo in networkList) {
 *
 * //	checks if network has removed todos
 * // if so remove it from the localList
 * 		if (localList.contains(todo) && !network list.contains(todo)) {
 * 			localList.remove(todo)
 *        }
 *
 * //checks if network has todos that are not in local
 * 		if(!localList.contains(todo)) {
 * 			local.add(todo)
 *    }
 *
 * }
 */