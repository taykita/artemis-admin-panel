class Title extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			brokerURL: null
		};
	}

	componentDidMount() {
		const apiUrl = "/artemis/url";
		fetch(apiUrl)
			.then((response) => response.text())
			.then((url) => this.setState({
				brokerURL: url
			}));
	}


	render() {
		return (
			<div className="mainTitle">
				<h1>Информация о брокере</h1> <br/>
				<h3>Broker URL - {this.state.brokerURL}</h3>
			</div>
		);
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
			.then((response) => response.text())
			.then((data) => this.setState({
                data: data
            }));
	}

	render() {
		return (
            <div>
                <h1>AdminPanel</h1>
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
