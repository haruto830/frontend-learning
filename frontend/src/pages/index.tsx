import { GetServerSideProps } from "next";
import Head from "next/head";
import { Button, List, ListItem, ListItemText, TextField } from "@mui/material";

type Todo = {
  id: number;
  title: string;
  completed: boolean;
};

type Props = {
  todos: Todo[];
};

export default function Home(props: Props) {
  return (
    <>
      <Head>
        <title>Todo App</title>
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <div>
        <h1>My Todo App</h1>
        <TextField
          required={true}
          autoComplete="false"
          placeholder="新しいタスクを入力"
        />
        <Button variant="contained" size="large">
          追加
        </Button>
        <List>
          {props.todos?.map((todo) => (
            <ListItem key={todo.id}>
              <ListItemText primary={todo.title} />
            </ListItem>
          ))}
        </List>
      </div>
    </>
  );
}

export const getServerSideProps: GetServerSideProps = async () => {
  const todos: Todo[] = [
    { id: 1, title: "テスト１", completed: false },
    { id: 2, title: "テスト２", completed: false },
  ];

  return {
    props: {
      todos,
    },
  };
};
