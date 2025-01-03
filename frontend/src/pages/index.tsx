import { GetServerSideProps } from "next";
import Head from "next/head";
import { Button, List, ListItem, ListItemText, TextField } from "@mui/material";

type Todo = {
  id: number;
  title: string;
  description: string;
  isCompleted: boolean;
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

const apiUrl = process.env.NEXT_PUBLIC_API_URL || "http://localhost:8080";

export const getServerSideProps: GetServerSideProps = async () => {
  const res = await fetch(`${apiUrl}/todos`);
  const todos: Todo[] = await res.json();

  return {
    props: {
      todos,
    },
  };
};
