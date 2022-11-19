class Title extends React.Component {
	render() {
		return <h1>Title</h1>;
	}
}

class Panel extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            data: null
        };
    }

	componentDidMount() {
		const apiUrl = "/artemis/url";
		fetch(apiUrl)
			.then((response) => response.json())
			.then((data) => this.setState({
                data: data
            }));
	}

	render() {
		return (
            <div>
                <h1>AdminPanel</h1>
                <h5>{this.state.data}</h5>
            </div>
        )
	}
}

class SideMenu extends React.Component {
	render() {
		return <h1>SideMenu</h1>;
	}
}

class Root extends React.Component {
	render() {
		return (
			<div className="row">
				<div className="col-md-1">
					<SideMenu />
				</div>
				<div className="col-md-11">
					<Title />
					<Panel />
				</div>
			</div>
		);
	}
}

ReactDOM.render(<Root />, document.getElementById("root"));

//ReactDOM.render(
//    <h1>Hello, world</h1>,
//    document.getElementById('root')
//)
